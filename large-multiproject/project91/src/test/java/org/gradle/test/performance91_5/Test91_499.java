package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_499 {
    private final Production91_499 production = new Production91_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}