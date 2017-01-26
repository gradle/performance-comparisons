package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_150 {
    private final Production59_150 production = new Production59_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}