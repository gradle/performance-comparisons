package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_257 {
    private final Production59_257 production = new Production59_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}