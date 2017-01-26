package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_435 {
    private final Production5_435 production = new Production5_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}