package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_165 {
    private final Production7_165 production = new Production7_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}