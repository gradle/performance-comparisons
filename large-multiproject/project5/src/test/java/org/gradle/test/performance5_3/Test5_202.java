package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_202 {
    private final Production5_202 production = new Production5_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}