package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_83 {
    private final Production59_83 production = new Production59_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}