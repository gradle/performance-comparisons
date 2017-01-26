package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_380 {
    private final Production2_380 production = new Production2_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}