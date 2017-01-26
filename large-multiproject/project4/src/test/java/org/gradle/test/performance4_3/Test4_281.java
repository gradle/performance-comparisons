package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_281 {
    private final Production4_281 production = new Production4_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}