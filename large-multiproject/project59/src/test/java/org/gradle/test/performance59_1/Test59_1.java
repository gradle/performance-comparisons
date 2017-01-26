package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_1 {
    private final Production59_1 production = new Production59_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}