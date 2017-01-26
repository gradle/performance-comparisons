package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_381 {
    private final Production59_381 production = new Production59_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}