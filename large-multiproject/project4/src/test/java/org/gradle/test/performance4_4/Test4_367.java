package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_367 {
    private final Production4_367 production = new Production4_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}