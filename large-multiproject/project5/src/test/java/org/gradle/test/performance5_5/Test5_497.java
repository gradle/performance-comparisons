package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_497 {
    private final Production5_497 production = new Production5_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}