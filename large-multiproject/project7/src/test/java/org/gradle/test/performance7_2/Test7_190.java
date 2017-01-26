package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_190 {
    private final Production7_190 production = new Production7_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}