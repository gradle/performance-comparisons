package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_196 {
    private final Production5_196 production = new Production5_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}