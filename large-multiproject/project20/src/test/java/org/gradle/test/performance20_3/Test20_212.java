package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_212 {
    private final Production20_212 production = new Production20_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}