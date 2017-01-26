package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_114 {
    private final Production93_114 production = new Production93_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}