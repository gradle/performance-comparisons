package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_138 {
    private final Production4_138 production = new Production4_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}