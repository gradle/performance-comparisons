package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_115 {
    private final Production59_115 production = new Production59_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}