package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_109 {
    private final Production93_109 production = new Production93_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}