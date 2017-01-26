package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_12 {
    private final Production92_12 production = new Production92_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}