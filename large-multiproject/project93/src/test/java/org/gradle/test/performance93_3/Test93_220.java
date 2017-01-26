package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_220 {
    private final Production93_220 production = new Production93_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}