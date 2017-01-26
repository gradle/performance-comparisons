package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_400 {
    private final Production59_400 production = new Production59_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}