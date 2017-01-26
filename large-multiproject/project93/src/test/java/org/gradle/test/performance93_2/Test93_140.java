package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_140 {
    private final Production93_140 production = new Production93_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}