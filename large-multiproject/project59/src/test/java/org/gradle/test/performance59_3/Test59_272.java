package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_272 {
    private final Production59_272 production = new Production59_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}