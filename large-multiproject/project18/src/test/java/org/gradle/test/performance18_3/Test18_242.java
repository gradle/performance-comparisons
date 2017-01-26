package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_242 {
    private final Production18_242 production = new Production18_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}