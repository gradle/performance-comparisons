package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_368 {
    private final Production91_368 production = new Production91_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}