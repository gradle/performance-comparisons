package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_266 {
    private final Production4_266 production = new Production4_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}