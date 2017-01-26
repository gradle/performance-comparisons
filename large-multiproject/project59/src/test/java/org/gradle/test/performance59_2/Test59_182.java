package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_182 {
    private final Production59_182 production = new Production59_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}