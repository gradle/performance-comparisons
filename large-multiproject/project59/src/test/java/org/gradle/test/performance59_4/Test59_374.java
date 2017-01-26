package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_374 {
    private final Production59_374 production = new Production59_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}