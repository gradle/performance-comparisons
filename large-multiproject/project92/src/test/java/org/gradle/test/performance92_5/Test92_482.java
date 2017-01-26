package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_482 {
    private final Production92_482 production = new Production92_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}