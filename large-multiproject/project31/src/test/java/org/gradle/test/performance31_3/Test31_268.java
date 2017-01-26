package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_268 {
    private final Production31_268 production = new Production31_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}