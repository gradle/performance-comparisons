package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_143 {
    private final Production18_143 production = new Production18_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}