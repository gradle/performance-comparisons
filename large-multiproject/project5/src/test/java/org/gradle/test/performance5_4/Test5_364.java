package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_364 {
    private final Production5_364 production = new Production5_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}