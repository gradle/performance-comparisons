package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_324 {
    private final Production18_324 production = new Production18_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}