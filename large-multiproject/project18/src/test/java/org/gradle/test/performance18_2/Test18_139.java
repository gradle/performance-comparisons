package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_139 {
    private final Production18_139 production = new Production18_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}