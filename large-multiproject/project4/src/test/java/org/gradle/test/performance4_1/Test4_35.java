package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_35 {
    private final Production4_35 production = new Production4_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}