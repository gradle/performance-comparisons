package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_302 {
    private final Production18_302 production = new Production18_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}