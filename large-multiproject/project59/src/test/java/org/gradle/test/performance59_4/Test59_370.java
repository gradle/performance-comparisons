package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_370 {
    private final Production59_370 production = new Production59_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}