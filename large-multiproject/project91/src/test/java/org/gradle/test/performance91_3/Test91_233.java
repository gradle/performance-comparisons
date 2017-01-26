package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_233 {
    private final Production91_233 production = new Production91_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}