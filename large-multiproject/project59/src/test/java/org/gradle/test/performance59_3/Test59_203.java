package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_203 {
    private final Production59_203 production = new Production59_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}