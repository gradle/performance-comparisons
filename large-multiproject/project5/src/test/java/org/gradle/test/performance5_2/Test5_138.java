package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_138 {
    private final Production5_138 production = new Production5_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}