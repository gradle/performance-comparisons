package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_237 {
    private final Production59_237 production = new Production59_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}