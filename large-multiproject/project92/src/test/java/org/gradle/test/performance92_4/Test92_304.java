package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_304 {
    private final Production92_304 production = new Production92_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}