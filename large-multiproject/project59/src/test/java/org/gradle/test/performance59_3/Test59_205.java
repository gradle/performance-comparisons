package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_205 {
    private final Production59_205 production = new Production59_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}