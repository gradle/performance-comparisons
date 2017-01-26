package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_331 {
    private final Production4_331 production = new Production4_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}