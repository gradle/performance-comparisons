package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_251 {
    private final Production5_251 production = new Production5_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}