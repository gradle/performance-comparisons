package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_74 {
    private final Production4_74 production = new Production4_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}