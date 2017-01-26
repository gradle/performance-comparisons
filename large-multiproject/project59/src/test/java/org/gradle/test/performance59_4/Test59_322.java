package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_322 {
    private final Production59_322 production = new Production59_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}