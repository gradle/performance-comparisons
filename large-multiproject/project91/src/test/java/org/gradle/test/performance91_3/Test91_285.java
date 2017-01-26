package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_285 {
    private final Production91_285 production = new Production91_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}