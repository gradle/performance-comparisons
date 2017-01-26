package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_81 {
    private final Production93_81 production = new Production93_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}