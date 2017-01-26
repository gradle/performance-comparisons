package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_466 {
    private final Production93_466 production = new Production93_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}