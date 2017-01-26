package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_162 {
    private final Production93_162 production = new Production93_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}