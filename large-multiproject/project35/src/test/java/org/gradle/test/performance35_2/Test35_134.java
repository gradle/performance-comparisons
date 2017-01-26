package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_134 {
    private final Production35_134 production = new Production35_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}