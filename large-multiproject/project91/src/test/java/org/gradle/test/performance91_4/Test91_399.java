package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_399 {
    private final Production91_399 production = new Production91_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}