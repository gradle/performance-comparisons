package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_24 {
    private final Production59_24 production = new Production59_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}