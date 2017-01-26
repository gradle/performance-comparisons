package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_187 {
    private final Production93_187 production = new Production93_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}