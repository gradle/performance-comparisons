package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_154 {
    private final Production59_154 production = new Production59_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}