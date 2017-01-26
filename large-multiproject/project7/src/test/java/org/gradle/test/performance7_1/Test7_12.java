package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_12 {
    private final Production7_12 production = new Production7_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}