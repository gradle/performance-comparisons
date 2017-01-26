package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_479 {
    private final Production59_479 production = new Production59_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}