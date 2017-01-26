package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_191 {
    private final Production20_191 production = new Production20_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}