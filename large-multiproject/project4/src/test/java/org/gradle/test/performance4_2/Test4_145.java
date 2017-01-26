package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_145 {
    private final Production4_145 production = new Production4_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}