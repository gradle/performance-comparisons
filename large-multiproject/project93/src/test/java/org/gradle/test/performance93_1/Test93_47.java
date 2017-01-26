package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_47 {
    private final Production93_47 production = new Production93_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}