package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_149 {
    private final Production59_149 production = new Production59_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}