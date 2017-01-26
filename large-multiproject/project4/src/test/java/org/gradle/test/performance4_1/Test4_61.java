package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_61 {
    private final Production4_61 production = new Production4_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}