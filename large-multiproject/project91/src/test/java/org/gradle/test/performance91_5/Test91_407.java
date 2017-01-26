package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_407 {
    private final Production91_407 production = new Production91_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}