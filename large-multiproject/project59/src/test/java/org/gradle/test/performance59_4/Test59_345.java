package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_345 {
    private final Production59_345 production = new Production59_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}