package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_401 {
    private final Production59_401 production = new Production59_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}