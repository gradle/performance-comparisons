package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_328 {
    private final Production91_328 production = new Production91_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}