package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_343 {
    private final Production59_343 production = new Production59_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}