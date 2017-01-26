package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_473 {
    private final Production59_473 production = new Production59_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}