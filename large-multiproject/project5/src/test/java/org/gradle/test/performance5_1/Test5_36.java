package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_36 {
    private final Production5_36 production = new Production5_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}