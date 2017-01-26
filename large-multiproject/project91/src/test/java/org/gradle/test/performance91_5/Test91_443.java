package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_443 {
    private final Production91_443 production = new Production91_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}