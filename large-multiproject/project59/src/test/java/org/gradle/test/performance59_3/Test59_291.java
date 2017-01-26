package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_291 {
    private final Production59_291 production = new Production59_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}