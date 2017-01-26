package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_5 {
    private final Production92_5 production = new Production92_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}