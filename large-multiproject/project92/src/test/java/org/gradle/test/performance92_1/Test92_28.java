package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_28 {
    private final Production92_28 production = new Production92_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}