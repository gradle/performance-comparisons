package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_129 {
    private final Production59_129 production = new Production59_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}