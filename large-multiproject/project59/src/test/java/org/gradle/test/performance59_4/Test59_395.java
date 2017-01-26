package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_395 {
    private final Production59_395 production = new Production59_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}