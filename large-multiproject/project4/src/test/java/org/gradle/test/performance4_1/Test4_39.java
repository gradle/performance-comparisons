package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_39 {
    private final Production4_39 production = new Production4_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}