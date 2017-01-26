package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_85 {
    private final Production83_85 production = new Production83_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}