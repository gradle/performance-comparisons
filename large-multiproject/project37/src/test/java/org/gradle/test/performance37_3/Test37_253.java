package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_253 {
    private final Production37_253 production = new Production37_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}