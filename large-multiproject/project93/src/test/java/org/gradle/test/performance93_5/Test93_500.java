package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_500 {
    private final Production93_500 production = new Production93_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}