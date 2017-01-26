package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_53 {
    private final Production5_53 production = new Production5_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}