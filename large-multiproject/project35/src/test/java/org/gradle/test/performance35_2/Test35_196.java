package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_196 {
    private final Production35_196 production = new Production35_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}