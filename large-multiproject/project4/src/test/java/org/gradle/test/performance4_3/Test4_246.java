package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_246 {
    private final Production4_246 production = new Production4_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}