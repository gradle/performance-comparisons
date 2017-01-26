package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_198 {
    private final Production59_198 production = new Production59_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}