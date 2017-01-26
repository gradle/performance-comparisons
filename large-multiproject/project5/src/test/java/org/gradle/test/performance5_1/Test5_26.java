package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_26 {
    private final Production5_26 production = new Production5_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}