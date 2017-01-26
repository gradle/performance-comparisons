package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_327 {
    private final Production91_327 production = new Production91_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}