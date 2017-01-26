package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_30 {
    private final Production59_30 production = new Production59_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}