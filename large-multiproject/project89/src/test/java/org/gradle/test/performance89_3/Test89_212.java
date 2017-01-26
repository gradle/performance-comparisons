package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_212 {
    private final Production89_212 production = new Production89_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}