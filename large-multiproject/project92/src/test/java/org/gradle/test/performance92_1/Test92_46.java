package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_46 {
    private final Production92_46 production = new Production92_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}