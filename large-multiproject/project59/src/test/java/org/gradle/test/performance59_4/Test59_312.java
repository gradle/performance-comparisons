package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_312 {
    private final Production59_312 production = new Production59_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}