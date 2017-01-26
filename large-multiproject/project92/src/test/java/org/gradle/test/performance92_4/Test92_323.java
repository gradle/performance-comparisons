package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_323 {
    private final Production92_323 production = new Production92_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}