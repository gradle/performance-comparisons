package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_28 {
    private final Production4_28 production = new Production4_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}