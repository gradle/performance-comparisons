package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_7 {
    private final Production93_7 production = new Production93_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}