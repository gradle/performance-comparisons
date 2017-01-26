package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_441 {
    private final Production59_441 production = new Production59_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}