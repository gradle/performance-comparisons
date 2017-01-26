package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_247 {
    private final Production59_247 production = new Production59_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}