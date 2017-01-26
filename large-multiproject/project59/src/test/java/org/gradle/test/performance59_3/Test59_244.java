package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_244 {
    private final Production59_244 production = new Production59_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}