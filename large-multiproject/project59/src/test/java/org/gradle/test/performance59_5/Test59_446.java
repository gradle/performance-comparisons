package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_446 {
    private final Production59_446 production = new Production59_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}