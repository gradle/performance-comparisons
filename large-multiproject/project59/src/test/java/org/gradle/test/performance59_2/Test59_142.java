package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_142 {
    private final Production59_142 production = new Production59_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}