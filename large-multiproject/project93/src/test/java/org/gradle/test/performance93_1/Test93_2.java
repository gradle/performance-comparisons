package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_2 {
    private final Production93_2 production = new Production93_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}