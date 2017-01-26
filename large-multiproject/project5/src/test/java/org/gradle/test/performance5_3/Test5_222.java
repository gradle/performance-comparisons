package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_222 {
    private final Production5_222 production = new Production5_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}