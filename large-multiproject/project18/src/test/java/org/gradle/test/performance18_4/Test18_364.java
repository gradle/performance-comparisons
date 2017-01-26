package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_364 {
    private final Production18_364 production = new Production18_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}