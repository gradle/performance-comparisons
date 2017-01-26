package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_298 {
    private final Production64_298 production = new Production64_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}