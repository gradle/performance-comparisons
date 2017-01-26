package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_57 {
    private final Production59_57 production = new Production59_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}