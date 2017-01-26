package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_422 {
    private final Production5_422 production = new Production5_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}