package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_58 {
    private final Production4_58 production = new Production4_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}