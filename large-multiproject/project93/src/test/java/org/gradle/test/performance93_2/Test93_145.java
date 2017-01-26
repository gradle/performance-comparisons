package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_145 {
    private final Production93_145 production = new Production93_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}