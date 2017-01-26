package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_71 {
    private final Production84_71 production = new Production84_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}