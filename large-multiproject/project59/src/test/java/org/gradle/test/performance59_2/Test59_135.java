package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_135 {
    private final Production59_135 production = new Production59_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}