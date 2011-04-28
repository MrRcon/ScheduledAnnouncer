/*
 * Copyright (c) 2011, Michael Hohl
 *
 * All rights reserved.
 */

package at.co.hohl.Announcer;

import at.co.hohl.Permissions.Permission;

/**
 * Static container for the permissions.
 *
 * @author Michael Hohl
 */
public final class AnnouncerPermissions {
    /** The permission needed for receiving announcements this plugin. */
    public static final Permission RECEIVER = new Permission("announcer.receiver", false);
    /** The permission needed to add new announcements. */
    public static final Permission ADD = new Permission("announcer.add");
    /** The permission needed to delete existing announcements. */
    public static final Permission DELETE = new Permission("announcer.delete");
    /** The permission needed to broadcast existing announcements. */
    public static final Permission BROADCAST = new Permission("announcer.broadcast");
    /** The permission needed for moderating this plugin. */
    public static final Permission MODERATOR = new Permission("announcer.moderate");
    /** The permission needed for moderating this plugin. */
    public static final Permission ADMINISTRATOR = new Permission("announcer.admin");
}
