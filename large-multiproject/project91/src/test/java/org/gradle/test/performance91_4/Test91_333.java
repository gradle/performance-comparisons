package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_333 {
    private final Production91_333 production = new Production91_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}