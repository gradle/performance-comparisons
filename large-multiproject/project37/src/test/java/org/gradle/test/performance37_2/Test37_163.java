package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_163 {
    private final Production37_163 production = new Production37_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}