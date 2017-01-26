package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_188 {
    private final Production59_188 production = new Production59_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}