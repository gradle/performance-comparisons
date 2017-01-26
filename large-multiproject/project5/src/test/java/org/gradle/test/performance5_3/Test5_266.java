package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_266 {
    private final Production5_266 production = new Production5_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}