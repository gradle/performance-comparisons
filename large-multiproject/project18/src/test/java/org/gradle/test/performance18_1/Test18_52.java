package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_52 {
    private final Production18_52 production = new Production18_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}