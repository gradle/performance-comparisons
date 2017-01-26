package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_283 {
    private final Production59_283 production = new Production59_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}