package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_12 {
    private final Production4_12 production = new Production4_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}