package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_46 {
    private final Production4_46 production = new Production4_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}