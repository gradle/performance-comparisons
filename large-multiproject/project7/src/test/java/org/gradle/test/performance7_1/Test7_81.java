package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_81 {
    private final Production7_81 production = new Production7_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}