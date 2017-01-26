package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_429 {
    private final Production91_429 production = new Production91_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}