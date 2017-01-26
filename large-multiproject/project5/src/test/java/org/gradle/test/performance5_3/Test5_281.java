package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_281 {
    private final Production5_281 production = new Production5_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}