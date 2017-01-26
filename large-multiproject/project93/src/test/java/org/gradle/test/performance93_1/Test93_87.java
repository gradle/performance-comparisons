package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_87 {
    private final Production93_87 production = new Production93_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}