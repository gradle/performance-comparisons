package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_412 {
    private final Production59_412 production = new Production59_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}