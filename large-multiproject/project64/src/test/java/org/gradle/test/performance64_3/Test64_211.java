package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_211 {
    private final Production64_211 production = new Production64_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}