package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_113 {
    private final Production59_113 production = new Production59_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}