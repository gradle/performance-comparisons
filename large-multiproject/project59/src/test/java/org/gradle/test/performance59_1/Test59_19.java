package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_19 {
    private final Production59_19 production = new Production59_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}