package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_95 {
    private final Production7_95 production = new Production7_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}