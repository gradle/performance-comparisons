package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_60 {
    private final Production37_60 production = new Production37_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}