/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tchubs.website.dao;

import com.tchubs.website.model.Article;

/**
 *
 * @author tchubs
 */
public class MockContentDAO implements ContentDAO{

    @Override
    public Article[] loadContent() throws DataAccessException{
        Article[] mockArticles = new Article[2];
        mockArticles[0] = new Article();
        mockArticles[0].setTitle( "Useful Java SE Threading Trick");
        mockArticles[0].setText( "<p>There was an very useful mechanism added in Java SE 5. It allows you to use a monitoring 'master' thread which registers itself with 'worker' (Swing/IO) threads to catch any uncaught runtime exceptions. In my app once an exception is caught it notifies the user and prompts them to see if they want to 'recover.'</p><p>The thread stays alive (i.e. non-daemon) to catch any exceptions and re-init the application (rather then have the application hard crash).</p><p>It's in java.lang.Thread class as of Java 5. See below</p><p>tchubs</p>");
        mockArticles[1] = new Article();
        mockArticles[1].setTitle( "Agile & Iterative Development - Timeboxing");
        mockArticles[1].setText( "Why timeboxing?<br/><br/>One short answer is client & developer morale. One of the great irritations in software development is either waiting for a release if you are a client or waiting for users to see your stuff as a developer. I mean, after all, one of the reasons we are engineers and not say investment bankers is that we desire to create things which are used in the world (fancy financial derivative products notwithstanding). Similarly, a client that receives a steady reliable stream of product improvements is more apt to feel comfortable with the software team than if they are repeatedly told (just wait for this next release – it will blow your socks off). Even if the next release with everything but the kitchen sink is delivered often a trust in timelines has been so broken that the political situation has become hostile.<br/><br/>Flow of Features<br/><br/>Time boxing ensures a steady flow of productive features and steady results that everyone can point to. A bird in the hand is worth two in the bush and all that. On top of this regular time boxing and short release cycles ensures that features that are quick and easy to develop get in the users hands as fast as possible rather than being held up by that must have feature which takes 10x as long. Further, as software developers are not mind readers, early incremental feature release ensures that the development and client groups are on the same page.<br/><br/>Timebox Length<br/><br/>Timeboxes are usually most effective when they have a length of three to six weeks [Larman]. This gives sufficient time for a design phase (if used) as well as the generation of any associated work products complimentary but tangential to the code itself (e.g. JavaDoc or as built architectural diagrams).<br/><br/>Feature Reduction not Extended Deadlines<br/><br/>From Larman:<br/><br/>If it eventually appears that the chosen requests (the scope) for the iteration can’t be met within the timebox, then rather than slip the iteration end date, the scope is reduced (pacing lower priority requests back on the wish-list) so that the partial, growing system always ends in a stable and tested state on the original planned iteration end date.<br/>This is a really big point and the one that requires the most moral courage on the part of the iteration leader. You can’t extend dates. The date is real and nothing can change it. I have worked on projects that both suffered from both missed dates and angry clients as well as fake dates and angry developers. The dates should be sacrosanct and form a sort of contract between the developers and the client. Whatever is in the release can change but the client and the developers can know that the release will go out.<br/><br/>Larman additionally notes that:<br/><br/>It is important that timeboxing is not used to pressure developers to work linger hours to meet the soon-coming deadline. If the normal pace of work is insufficient, do less.Also key, undoubtedly code quality goes down and bug rates go up when people start working 12 hour days and forgo family life. The rush to get the job done invariably introduces quick fixes and hacks. If these are right before a release it is unlikely that they will get caught and fixed at that time. An additional tenant of Agile and Iterative Development is that bugs and design flaws caught early are on an order of magnitude cheaper to fix then down the road.");
        return mockArticles;
    }

    @Override
    public void initialize() throws DataAccessException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void saveArticle( Article article ) throws DataAccessException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void destroy(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
