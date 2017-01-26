package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_134 {
    private final Production5_134 production = new Production5_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}