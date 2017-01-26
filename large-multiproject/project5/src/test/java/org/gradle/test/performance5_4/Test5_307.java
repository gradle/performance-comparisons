package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_307 {
    private final Production5_307 production = new Production5_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}