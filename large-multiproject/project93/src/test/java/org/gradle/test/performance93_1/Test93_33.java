package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_33 {
    private final Production93_33 production = new Production93_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}