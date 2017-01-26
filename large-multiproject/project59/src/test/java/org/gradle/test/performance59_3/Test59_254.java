package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_254 {
    private final Production59_254 production = new Production59_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}