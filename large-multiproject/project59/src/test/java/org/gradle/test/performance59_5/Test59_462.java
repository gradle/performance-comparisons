package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_462 {
    private final Production59_462 production = new Production59_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}