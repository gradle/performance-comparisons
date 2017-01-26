package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_103 {
    private final Production7_103 production = new Production7_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}