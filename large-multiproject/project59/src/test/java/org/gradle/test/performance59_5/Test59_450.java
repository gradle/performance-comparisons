package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_450 {
    private final Production59_450 production = new Production59_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}