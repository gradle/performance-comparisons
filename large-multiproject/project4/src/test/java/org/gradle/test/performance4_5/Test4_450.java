package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_450 {
    private final Production4_450 production = new Production4_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}