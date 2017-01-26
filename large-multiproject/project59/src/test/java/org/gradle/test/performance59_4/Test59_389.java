package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_389 {
    private final Production59_389 production = new Production59_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}