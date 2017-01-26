package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_476 {
    private final Production4_476 production = new Production4_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}