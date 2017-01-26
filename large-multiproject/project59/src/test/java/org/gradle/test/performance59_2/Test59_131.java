package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_131 {
    private final Production59_131 production = new Production59_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}