package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_33 {
    private final Production59_33 production = new Production59_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}