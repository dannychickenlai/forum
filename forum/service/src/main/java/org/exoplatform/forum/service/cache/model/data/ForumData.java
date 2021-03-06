package org.exoplatform.forum.service.cache.model.data;

import org.exoplatform.forum.common.cache.model.CachedData;
import org.exoplatform.forum.service.Forum;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public class ForumData implements CachedData<Forum> {

  public final static ForumData NULL = new ForumData(new Forum());

  private final String id;
  private final String owner;
  private final String path;
  private final int forumOrder;
  private final Date createdDate;
  private final String modifiedBy;
  private final Date modifiedDate;
  private final String lastTopicPath;
  private final String name;
  private final String description;
  private final long postCount;
  private final long topicCount;
  private final String[] notifyWhenAddTopic;
  private final String[] notifyWhenAddPost;
  private final boolean isAutoAddEmailNotify;
  private final boolean isModerateTopic;
  private final boolean isModeratePost;
  private final boolean isClosed;
  private final boolean isLock;
  private final String[] moderators;
  private final String[] createTopicRole;
  private final String[] viewer;
  private final String[] poster;
  private final String[] emailNotification;
  private final String[] banIPs;
  
  public ForumData(Forum forum) {

    this.id = forum.getId();
    this.owner = forum.getOwner();
    this.path = forum.getPath();
    this.forumOrder = forum.getForumOrder();
    this.createdDate = forum.getCreatedDate();
    this.modifiedBy = forum.getModifiedBy();
    this.modifiedDate = forum.getModifiedDate();
    this.lastTopicPath = forum.getLastTopicPath();
    this.name = forum.getForumName();
    this.description = forum.getDescription();
    this.postCount = forum.getPostCount();
    this.topicCount = forum.getTopicCount();
    this.notifyWhenAddTopic = forum.getNotifyWhenAddTopic();
    this.notifyWhenAddPost = forum.getNotifyWhenAddPost();
    this.isAutoAddEmailNotify = forum.getIsAutoAddEmailNotify();
    this.isModerateTopic = forum.getIsModerateTopic();
    this.isModeratePost = forum.getIsModeratePost();
    this.isClosed = forum.getIsClosed();
    this.isLock = forum.getIsLock();
    this.moderators = forum.getModerators();
    this.createTopicRole = forum.getCreateTopicRole();
    this.viewer = forum.getViewer();
    this.poster = forum.getPoster();
    this.emailNotification = forum.getEmailNotification();
    if (forum.getBanIP() != null) {
      this.banIPs = forum.getBanIP().toArray(new String[]{});
    } else {
      this.banIPs = null;
    }

  }

  public Forum build() {

    if (this == NULL) {
      return null;
    }

    Forum forum = new Forum();
    forum.setId(this.id);
    forum.setOwner(this.owner);
    forum.setPath(this.path);
    forum.setForumOrder(this.forumOrder);
    forum.setCreatedDate(this.createdDate);
    forum.setModifiedBy(this.modifiedBy);
    forum.setModifiedDate(this.modifiedDate);
    forum.setLastTopicPath(this.lastTopicPath);
    forum.setForumName(this.name);
    forum.setDescription(this.description);
    forum.setPostCount(this.postCount);
    forum.setTopicCount(this.topicCount);
    forum.setNotifyWhenAddTopic(this.notifyWhenAddTopic);
    forum.setNotifyWhenAddPost(this.notifyWhenAddPost);
    forum.setIsAutoAddEmailNotify(this.isAutoAddEmailNotify);
    forum.setIsModerateTopic(this.isModerateTopic);
    forum.setIsModeratePost(this.isModeratePost);
    forum.setIsClosed(this.isClosed);
    forum.setIsLock(this.isLock);
    forum.setModerators(this.moderators);
    forum.setCreateTopicRole(this.createTopicRole);
    forum.setViewer(this.viewer);
    forum.setPoster(this.poster);
    forum.setEmailNotification(this.emailNotification);
    if (this.banIPs != null) {
      forum.setBanIP(Arrays.asList(this.banIPs));
    }
    return forum;

  }

  public String getPath() {
    return path;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ForumData forumData = (ForumData) o;
    return forumOrder == forumData.forumOrder &&
            postCount == forumData.postCount &&
            topicCount == forumData.topicCount &&
            isAutoAddEmailNotify == forumData.isAutoAddEmailNotify &&
            isModerateTopic == forumData.isModerateTopic &&
            isModeratePost == forumData.isModeratePost &&
            isClosed == forumData.isClosed &&
            isLock == forumData.isLock &&
            Objects.equals(id, forumData.id) &&
            Objects.equals(owner, forumData.owner) &&
            Objects.equals(path, forumData.path) &&
            Objects.equals(createdDate, forumData.createdDate) &&
            Objects.equals(modifiedBy, forumData.modifiedBy) &&
            Objects.equals(modifiedDate, forumData.modifiedDate) &&
            Objects.equals(lastTopicPath, forumData.lastTopicPath) &&
            Objects.equals(name, forumData.name) &&
            Objects.equals(description, forumData.description) &&
            Arrays.equals(notifyWhenAddTopic, forumData.notifyWhenAddTopic) &&
            Arrays.equals(notifyWhenAddPost, forumData.notifyWhenAddPost) &&
            Arrays.equals(moderators, forumData.moderators) &&
            Arrays.equals(createTopicRole, forumData.createTopicRole) &&
            Arrays.equals(viewer, forumData.viewer) &&
            Arrays.equals(poster, forumData.poster) &&
            Arrays.equals(emailNotification, forumData.emailNotification) &&
            Arrays.equals(banIPs, forumData.banIPs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, owner, path, forumOrder, createdDate, modifiedBy, modifiedDate, lastTopicPath,
            name, description, postCount, topicCount, notifyWhenAddTopic, notifyWhenAddPost, isAutoAddEmailNotify,
            isModerateTopic, isModeratePost, isClosed, isLock, moderators, createTopicRole, viewer, poster, emailNotification, banIPs);
  }
}
