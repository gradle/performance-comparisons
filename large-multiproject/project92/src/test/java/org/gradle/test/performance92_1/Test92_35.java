package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_35 {
    private final Production92_35 production = new Production92_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}