package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_206 {
    private final Production59_206 production = new Production59_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}