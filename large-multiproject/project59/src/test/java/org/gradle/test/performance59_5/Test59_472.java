package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_472 {
    private final Production59_472 production = new Production59_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}