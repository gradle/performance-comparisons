package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_367 {
    private final Production92_367 production = new Production92_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}