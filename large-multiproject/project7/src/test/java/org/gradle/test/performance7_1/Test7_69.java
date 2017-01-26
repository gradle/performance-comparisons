package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_69 {
    private final Production7_69 production = new Production7_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}