package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_407 {
    private final Production59_407 production = new Production59_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}