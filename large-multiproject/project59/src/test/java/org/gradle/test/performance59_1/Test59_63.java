package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_63 {
    private final Production59_63 production = new Production59_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}