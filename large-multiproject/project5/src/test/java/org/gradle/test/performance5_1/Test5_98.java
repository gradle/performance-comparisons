package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_98 {
    private final Production5_98 production = new Production5_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}