package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_259 {
    private final Production93_259 production = new Production93_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}