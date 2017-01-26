package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_302 {
    private final Production93_302 production = new Production93_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}