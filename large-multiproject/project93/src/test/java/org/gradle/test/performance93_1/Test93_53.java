package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_53 {
    private final Production93_53 production = new Production93_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}