package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_134 {
    private final Production4_134 production = new Production4_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}