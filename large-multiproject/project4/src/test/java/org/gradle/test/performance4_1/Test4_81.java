package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_81 {
    private final Production4_81 production = new Production4_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}