package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_92 {
    private final Production93_92 production = new Production93_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}