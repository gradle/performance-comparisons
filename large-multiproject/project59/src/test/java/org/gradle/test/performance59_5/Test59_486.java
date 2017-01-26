package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_486 {
    private final Production59_486 production = new Production59_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}