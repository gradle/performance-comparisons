package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_483 {
    private final Production91_483 production = new Production91_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}