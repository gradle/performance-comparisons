package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_256 {
    private final Production59_256 production = new Production59_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}