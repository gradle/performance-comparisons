package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_422 {
    private final Production4_422 production = new Production4_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}