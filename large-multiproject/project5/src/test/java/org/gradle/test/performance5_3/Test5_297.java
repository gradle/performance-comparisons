package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_297 {
    private final Production5_297 production = new Production5_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}