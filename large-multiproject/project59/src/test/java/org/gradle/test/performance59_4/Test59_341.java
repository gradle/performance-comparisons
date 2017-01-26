package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_341 {
    private final Production59_341 production = new Production59_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}