package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_60 {
    private final Production5_60 production = new Production5_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}