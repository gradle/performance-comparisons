package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_434 {
    private final Production59_434 production = new Production59_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}