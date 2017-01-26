package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_59 {
    private final Production93_59 production = new Production93_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}