package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_348 {
    private final Production59_348 production = new Production59_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}