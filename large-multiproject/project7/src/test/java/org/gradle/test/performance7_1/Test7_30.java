package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_30 {
    private final Production7_30 production = new Production7_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}