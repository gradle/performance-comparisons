package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_228 {
    private final Production5_228 production = new Production5_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}