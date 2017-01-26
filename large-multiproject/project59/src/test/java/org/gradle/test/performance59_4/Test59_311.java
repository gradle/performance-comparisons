package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_311 {
    private final Production59_311 production = new Production59_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}