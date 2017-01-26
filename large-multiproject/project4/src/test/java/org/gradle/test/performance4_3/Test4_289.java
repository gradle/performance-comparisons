package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_289 {
    private final Production4_289 production = new Production4_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}