package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_87 {
    private final Production92_87 production = new Production92_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}