package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_452 {
    private final Production59_452 production = new Production59_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}