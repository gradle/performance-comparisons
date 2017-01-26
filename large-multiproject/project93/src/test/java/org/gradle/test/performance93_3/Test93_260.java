package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_260 {
    private final Production93_260 production = new Production93_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}