package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_26 {
    private final Production4_26 production = new Production4_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}