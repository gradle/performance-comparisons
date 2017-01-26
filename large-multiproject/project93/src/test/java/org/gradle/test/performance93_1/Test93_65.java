package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_65 {
    private final Production93_65 production = new Production93_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}