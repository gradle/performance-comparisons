package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_191 {
    private final Production98_191 production = new Production98_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}