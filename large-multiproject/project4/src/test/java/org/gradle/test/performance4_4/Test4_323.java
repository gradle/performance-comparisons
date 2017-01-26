package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_323 {
    private final Production4_323 production = new Production4_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}