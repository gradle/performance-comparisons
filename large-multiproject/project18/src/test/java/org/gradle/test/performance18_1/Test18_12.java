package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_12 {
    private final Production18_12 production = new Production18_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}