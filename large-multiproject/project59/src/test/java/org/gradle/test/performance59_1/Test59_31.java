package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_31 {
    private final Production59_31 production = new Production59_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}