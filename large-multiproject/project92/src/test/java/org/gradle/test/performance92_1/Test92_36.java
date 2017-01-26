package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_36 {
    private final Production92_36 production = new Production92_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}