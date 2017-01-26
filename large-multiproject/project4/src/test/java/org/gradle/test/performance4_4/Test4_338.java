package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_338 {
    private final Production4_338 production = new Production4_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}