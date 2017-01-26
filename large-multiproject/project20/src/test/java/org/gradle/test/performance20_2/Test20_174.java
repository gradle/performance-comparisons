package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_174 {
    private final Production20_174 production = new Production20_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}