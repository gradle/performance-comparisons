package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_55 {
    private final Production59_55 production = new Production59_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}