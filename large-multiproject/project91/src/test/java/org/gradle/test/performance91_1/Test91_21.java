package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_21 {
    private final Production91_21 production = new Production91_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}