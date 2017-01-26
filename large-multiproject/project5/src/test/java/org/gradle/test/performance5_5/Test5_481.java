package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_481 {
    private final Production5_481 production = new Production5_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}