package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_253 {
    private final Production5_253 production = new Production5_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}