package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_328 {
    private final Production59_328 production = new Production59_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}