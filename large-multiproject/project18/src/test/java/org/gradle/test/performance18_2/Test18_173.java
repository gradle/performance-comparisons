package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_173 {
    private final Production18_173 production = new Production18_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}