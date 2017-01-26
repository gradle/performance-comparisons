package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_174 {
    private final Production10_174 production = new Production10_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}