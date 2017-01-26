package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_71 {
    private final Production93_71 production = new Production93_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}