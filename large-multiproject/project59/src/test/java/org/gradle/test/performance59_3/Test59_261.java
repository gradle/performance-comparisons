package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_261 {
    private final Production59_261 production = new Production59_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}