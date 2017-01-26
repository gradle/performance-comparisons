package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_322 {
    private final Production92_322 production = new Production92_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}