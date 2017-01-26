package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_181 {
    private final Production93_181 production = new Production93_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}