package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_156 {
    private final Production59_156 production = new Production59_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}