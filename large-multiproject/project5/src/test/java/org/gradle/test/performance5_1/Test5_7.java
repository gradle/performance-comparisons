package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_7 {
    private final Production5_7 production = new Production5_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}