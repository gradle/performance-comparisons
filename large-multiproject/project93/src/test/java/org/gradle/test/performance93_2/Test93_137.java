package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_137 {
    private final Production93_137 production = new Production93_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}