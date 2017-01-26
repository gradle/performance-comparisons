package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_60 {
    private final Production92_60 production = new Production92_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}