package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_380 {
    private final Production59_380 production = new Production59_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}