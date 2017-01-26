package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_405 {
    private final Production5_405 production = new Production5_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}