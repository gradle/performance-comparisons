package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_180 {
    private final Production59_180 production = new Production59_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}