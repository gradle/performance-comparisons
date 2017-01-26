package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_396 {
    private final Production59_396 production = new Production59_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}