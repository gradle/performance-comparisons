package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_202 {
    private final Production37_202 production = new Production37_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}