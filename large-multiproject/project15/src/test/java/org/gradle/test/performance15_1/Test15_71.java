package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_71 {
    private final Production15_71 production = new Production15_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}