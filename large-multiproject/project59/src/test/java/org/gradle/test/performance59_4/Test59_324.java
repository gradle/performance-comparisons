package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_324 {
    private final Production59_324 production = new Production59_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}