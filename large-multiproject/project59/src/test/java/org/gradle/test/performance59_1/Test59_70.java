package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_70 {
    private final Production59_70 production = new Production59_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}