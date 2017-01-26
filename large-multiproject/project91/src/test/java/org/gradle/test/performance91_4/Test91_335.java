package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_335 {
    private final Production91_335 production = new Production91_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}