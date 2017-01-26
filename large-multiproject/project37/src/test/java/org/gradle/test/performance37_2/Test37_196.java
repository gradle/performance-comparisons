package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_196 {
    private final Production37_196 production = new Production37_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}