package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_260 {
    private final Production5_260 production = new Production5_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}