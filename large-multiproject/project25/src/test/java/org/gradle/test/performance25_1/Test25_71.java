package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_71 {
    private final Production25_71 production = new Production25_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}