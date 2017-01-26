package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_422 {
    private final Production92_422 production = new Production92_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}