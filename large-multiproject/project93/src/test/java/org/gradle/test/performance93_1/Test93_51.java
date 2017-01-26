package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_51 {
    private final Production93_51 production = new Production93_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}