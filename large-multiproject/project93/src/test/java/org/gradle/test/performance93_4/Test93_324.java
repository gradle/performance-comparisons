package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_324 {
    private final Production93_324 production = new Production93_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}