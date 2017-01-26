package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_92 {
    private final Production92_92 production = new Production92_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}