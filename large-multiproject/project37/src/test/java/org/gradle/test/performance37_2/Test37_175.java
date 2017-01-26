package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_175 {
    private final Production37_175 production = new Production37_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}