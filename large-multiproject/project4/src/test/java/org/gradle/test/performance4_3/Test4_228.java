package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_228 {
    private final Production4_228 production = new Production4_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}