package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_199 {
    private final Production37_199 production = new Production37_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}