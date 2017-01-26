package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_212 {
    private final Production4_212 production = new Production4_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}