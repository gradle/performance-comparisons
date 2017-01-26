package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_275 {
    private final Production91_275 production = new Production91_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}