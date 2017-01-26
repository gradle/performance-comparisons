package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_65 {
    private final Production18_65 production = new Production18_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}