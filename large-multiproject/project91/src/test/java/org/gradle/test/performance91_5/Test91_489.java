package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_489 {
    private final Production91_489 production = new Production91_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}