package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_483 {
    private final Production59_483 production = new Production59_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}