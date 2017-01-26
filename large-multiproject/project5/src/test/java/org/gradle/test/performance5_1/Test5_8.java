package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_8 {
    private final Production5_8 production = new Production5_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}