package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_36 {
    private final Production59_36 production = new Production59_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}