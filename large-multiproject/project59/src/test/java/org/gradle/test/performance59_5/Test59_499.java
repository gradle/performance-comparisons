package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_499 {
    private final Production59_499 production = new Production59_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}