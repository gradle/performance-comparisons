package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_35 {
    private final Production18_35 production = new Production18_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}