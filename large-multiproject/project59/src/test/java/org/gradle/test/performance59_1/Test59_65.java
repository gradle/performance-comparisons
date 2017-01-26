package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_65 {
    private final Production59_65 production = new Production59_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}