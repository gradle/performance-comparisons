package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_212 {
    private final Production37_212 production = new Production37_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}