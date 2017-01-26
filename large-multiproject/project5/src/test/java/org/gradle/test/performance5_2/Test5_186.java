package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_186 {
    private final Production5_186 production = new Production5_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}