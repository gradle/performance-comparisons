package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_191 {
    private final Production93_191 production = new Production93_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}