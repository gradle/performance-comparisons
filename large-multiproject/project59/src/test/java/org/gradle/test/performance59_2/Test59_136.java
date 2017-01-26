package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_136 {
    private final Production59_136 production = new Production59_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}