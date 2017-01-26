package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_265 {
    private final Production59_265 production = new Production59_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}