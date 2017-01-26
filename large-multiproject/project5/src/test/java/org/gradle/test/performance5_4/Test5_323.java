package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_323 {
    private final Production5_323 production = new Production5_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}