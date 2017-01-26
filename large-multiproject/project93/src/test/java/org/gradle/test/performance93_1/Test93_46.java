package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_46 {
    private final Production93_46 production = new Production93_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}