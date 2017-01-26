package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_243 {
    private final Production93_243 production = new Production93_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}