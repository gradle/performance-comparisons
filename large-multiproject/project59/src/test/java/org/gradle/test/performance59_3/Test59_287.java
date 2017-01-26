package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_287 {
    private final Production59_287 production = new Production59_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}