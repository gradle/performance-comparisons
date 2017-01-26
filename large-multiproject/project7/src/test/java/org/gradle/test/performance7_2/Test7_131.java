package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_131 {
    private final Production7_131 production = new Production7_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}