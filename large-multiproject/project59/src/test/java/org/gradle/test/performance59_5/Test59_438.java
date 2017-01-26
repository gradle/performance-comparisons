package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_438 {
    private final Production59_438 production = new Production59_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}