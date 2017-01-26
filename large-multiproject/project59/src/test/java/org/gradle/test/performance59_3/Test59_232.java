package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_232 {
    private final Production59_232 production = new Production59_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}