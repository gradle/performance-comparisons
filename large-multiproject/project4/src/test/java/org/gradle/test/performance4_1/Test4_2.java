package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_2 {
    private final Production4_2 production = new Production4_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}