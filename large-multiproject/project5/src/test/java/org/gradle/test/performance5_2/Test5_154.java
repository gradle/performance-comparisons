package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_154 {
    private final Production5_154 production = new Production5_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}