package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_204 {
    private final Production59_204 production = new Production59_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}