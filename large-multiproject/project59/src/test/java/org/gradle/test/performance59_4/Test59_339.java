package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_339 {
    private final Production59_339 production = new Production59_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}