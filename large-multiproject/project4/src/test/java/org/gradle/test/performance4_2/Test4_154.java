package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_154 {
    private final Production4_154 production = new Production4_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}