package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_252 {
    private final Production59_252 production = new Production59_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}