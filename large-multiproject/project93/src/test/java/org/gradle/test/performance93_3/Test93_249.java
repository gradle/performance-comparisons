package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_249 {
    private final Production93_249 production = new Production93_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}