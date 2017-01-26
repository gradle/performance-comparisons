package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_191 {
    private final Production37_191 production = new Production37_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}