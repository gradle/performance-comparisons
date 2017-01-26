package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_251 {
    private final Production31_251 production = new Production31_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}