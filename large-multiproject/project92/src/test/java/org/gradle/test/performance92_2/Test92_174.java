package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_174 {
    private final Production92_174 production = new Production92_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}