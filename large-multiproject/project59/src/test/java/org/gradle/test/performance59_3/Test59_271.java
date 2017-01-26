package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_271 {
    private final Production59_271 production = new Production59_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}