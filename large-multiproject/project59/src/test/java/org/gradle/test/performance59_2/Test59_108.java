package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_108 {
    private final Production59_108 production = new Production59_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}