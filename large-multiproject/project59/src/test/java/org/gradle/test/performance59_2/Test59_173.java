package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_173 {
    private final Production59_173 production = new Production59_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}