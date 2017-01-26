package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_67 {
    private final Production4_67 production = new Production4_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}