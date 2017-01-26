package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_25 {
    private final Production5_25 production = new Production5_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}