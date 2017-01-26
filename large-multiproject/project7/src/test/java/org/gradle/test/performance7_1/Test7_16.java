package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_16 {
    private final Production7_16 production = new Production7_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}