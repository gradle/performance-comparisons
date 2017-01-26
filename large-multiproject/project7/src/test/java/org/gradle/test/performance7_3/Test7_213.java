package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_213 {
    private final Production7_213 production = new Production7_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}