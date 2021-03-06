/**
 * ...
 * <p>
 * -----------------------------------------------------------------------------------<br>
 * (c) 2010-2014 OpenInfobutton Project, Biomedical Informatics, University of Utah<br>
 * Contact: {@code <andrew.iskander@utah.edu>}<br>
 * Biomedical Informatics<br>
 * 421 Wakara Way, Ste 140
 * Salt Lake City, UT 84108-3514<br>
 * Day Phone: 1-801-581-4080<br>
 * -----------------------------------------------------------------------------------
 *
 * @author Andrew Iskander {@code <andrew.iskander@utah.edu>}
 * @version May 5, 2014
 */
package org.openinfobutton.service.matching;

import java.util.Iterator;
import java.util.List;

import org.openinfobutton.schema.Holder;
import org.openinfobutton.schema.IDLite;
import org.openinfobutton.schema.KnowledgeRequest;
import org.openinfobutton.schemas.kb.Id;
import org.openinfobutton.schemas.kb.KnowledgeResourceProfile;
import org.openinfobutton.service.profile.ResourceProfileProvider;



public class AccessCheckHandler {

	public static List<KnowledgeResourceProfile> profiles;
	
	public static ResourceProfileProvider provider;
	
	private static String accessID;
	
	private static void initProfiles() {
		
		provider = ResourceProfileProvider.getInstance();
		profiles = provider.getProfiles();
	}
	
	public static boolean handleRequest(KnowledgeRequest request) {
		
		initProfiles();
		Holder holder = request.getHolder();
		IDLite representedOrganization = holder.getRepresentedOrganization();
		accessID = representedOrganization.getRoot();
		KnowledgeResourceProfile profile;
		for (Iterator<KnowledgeResourceProfile> iter = profiles.iterator(); iter.hasNext();) {
			profile = iter.next();
			if (!checkProfile(profile)) {
				iter.remove();
			}
		}
		provider.setProfiles(profiles);
		return profiles.isEmpty();
	}
	
	private static Boolean checkProfile (KnowledgeResourceProfile profile) {
		
		Boolean match = false;
		
		List<KnowledgeResourceProfile.ProfileDefinition.AuthorizedOrganizations.AuthorizedOrganization> authorizedOrganizations = profile.getProfileDefinition().getAuthorizedOrganizations().getAuthorizedOrganization();
		int authCount = authorizedOrganizations.size();
		Id id;
		for (int x = 0; x < authCount; x++) {
			id = authorizedOrganizations.get(x);
			if (accessID.equals(id.getId())) {
				
				match = true;
				break;
			}
		}
		return match;
	}

}
