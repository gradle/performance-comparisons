package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_33 {
    private final Production92_33 production = new Production92_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}