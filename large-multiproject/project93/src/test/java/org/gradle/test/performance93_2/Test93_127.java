package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_127 {
    private final Production93_127 production = new Production93_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}