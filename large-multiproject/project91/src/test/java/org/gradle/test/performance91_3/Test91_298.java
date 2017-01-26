package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_298 {
    private final Production91_298 production = new Production91_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}