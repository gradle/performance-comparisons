package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_367 {
    private final Production5_367 production = new Production5_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}