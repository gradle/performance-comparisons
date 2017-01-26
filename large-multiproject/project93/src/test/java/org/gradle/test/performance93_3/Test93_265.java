package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_265 {
    private final Production93_265 production = new Production93_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}