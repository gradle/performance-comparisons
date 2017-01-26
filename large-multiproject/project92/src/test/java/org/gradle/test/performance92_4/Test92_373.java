package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_373 {
    private final Production92_373 production = new Production92_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}