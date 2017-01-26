package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_436 {
    private final Production59_436 production = new Production59_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}