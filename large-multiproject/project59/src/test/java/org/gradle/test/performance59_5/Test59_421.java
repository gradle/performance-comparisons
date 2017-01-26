package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_421 {
    private final Production59_421 production = new Production59_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}