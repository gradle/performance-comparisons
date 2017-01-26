package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_36 {
    private final Production18_36 production = new Production18_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}