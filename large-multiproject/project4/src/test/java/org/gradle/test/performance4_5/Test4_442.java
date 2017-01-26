package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_442 {
    private final Production4_442 production = new Production4_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}