package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_191 {
    private final Production59_191 production = new Production59_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}