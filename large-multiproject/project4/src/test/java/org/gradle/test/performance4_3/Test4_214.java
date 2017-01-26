package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_214 {
    private final Production4_214 production = new Production4_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}