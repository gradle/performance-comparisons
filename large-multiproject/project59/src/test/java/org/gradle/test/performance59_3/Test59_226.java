package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_226 {
    private final Production59_226 production = new Production59_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}