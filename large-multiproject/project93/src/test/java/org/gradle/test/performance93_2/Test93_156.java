package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_156 {
    private final Production93_156 production = new Production93_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}