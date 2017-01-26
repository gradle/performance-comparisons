package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_356 {
    private final Production4_356 production = new Production4_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}