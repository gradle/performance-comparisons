package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_30 {
    private final Production93_30 production = new Production93_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}