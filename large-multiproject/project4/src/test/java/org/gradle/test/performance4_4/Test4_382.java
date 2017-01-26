package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_382 {
    private final Production4_382 production = new Production4_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}