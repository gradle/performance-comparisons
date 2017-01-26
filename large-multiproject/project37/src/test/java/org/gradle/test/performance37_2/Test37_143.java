package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_143 {
    private final Production37_143 production = new Production37_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}