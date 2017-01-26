package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_28 {
    private final Production5_28 production = new Production5_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}