package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_251 {
    private final Production37_251 production = new Production37_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}