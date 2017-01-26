package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_300 {
    private final Production4_300 production = new Production4_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}