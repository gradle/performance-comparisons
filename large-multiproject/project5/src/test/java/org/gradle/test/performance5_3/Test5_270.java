package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_270 {
    private final Production5_270 production = new Production5_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}