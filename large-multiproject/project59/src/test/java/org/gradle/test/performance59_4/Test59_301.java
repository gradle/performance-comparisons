package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_301 {
    private final Production59_301 production = new Production59_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}