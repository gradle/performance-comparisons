package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_64 {
    private final Production59_64 production = new Production59_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}