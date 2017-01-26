package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_342 {
    private final Production59_342 production = new Production59_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}