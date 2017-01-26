package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_321 {
    private final Production59_321 production = new Production59_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}