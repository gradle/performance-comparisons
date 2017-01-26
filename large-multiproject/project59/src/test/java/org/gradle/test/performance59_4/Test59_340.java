package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_340 {
    private final Production59_340 production = new Production59_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}