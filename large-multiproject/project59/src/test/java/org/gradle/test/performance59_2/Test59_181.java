package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_181 {
    private final Production59_181 production = new Production59_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}