package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_275 {
    private final Production59_275 production = new Production59_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}