package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_1 {
    private final Production93_1 production = new Production93_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}