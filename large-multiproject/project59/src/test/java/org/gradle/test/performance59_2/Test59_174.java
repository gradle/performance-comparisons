package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_174 {
    private final Production59_174 production = new Production59_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}