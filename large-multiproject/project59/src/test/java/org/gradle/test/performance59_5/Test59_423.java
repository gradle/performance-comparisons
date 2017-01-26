package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_423 {
    private final Production59_423 production = new Production59_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}