package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_220 {
    private final Production4_220 production = new Production4_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}