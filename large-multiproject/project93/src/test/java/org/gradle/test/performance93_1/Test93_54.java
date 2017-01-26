package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_54 {
    private final Production93_54 production = new Production93_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}