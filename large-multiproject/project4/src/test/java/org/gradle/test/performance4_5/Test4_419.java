package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_419 {
    private final Production4_419 production = new Production4_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}