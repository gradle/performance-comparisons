package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_470 {
    private final Production59_470 production = new Production59_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}