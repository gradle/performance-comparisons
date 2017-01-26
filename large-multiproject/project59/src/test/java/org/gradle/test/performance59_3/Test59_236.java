package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_236 {
    private final Production59_236 production = new Production59_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}