package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_349 {
    private final Production59_349 production = new Production59_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}