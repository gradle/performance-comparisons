package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_364 {
    private final Production37_364 production = new Production37_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}