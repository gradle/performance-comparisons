package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_103 {
    private final Production59_103 production = new Production59_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}