package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_295 {
    private final Production59_295 production = new Production59_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}