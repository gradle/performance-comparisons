package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_364 {
    private final Production4_364 production = new Production4_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}