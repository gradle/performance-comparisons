package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_380 {
    private final Production91_380 production = new Production91_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}