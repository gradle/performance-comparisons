package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_459 {
    private final Production59_459 production = new Production59_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}