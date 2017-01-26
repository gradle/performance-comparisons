package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_113 {
    private final Production7_113 production = new Production7_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}