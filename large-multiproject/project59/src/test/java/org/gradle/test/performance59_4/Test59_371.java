package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_371 {
    private final Production59_371 production = new Production59_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}