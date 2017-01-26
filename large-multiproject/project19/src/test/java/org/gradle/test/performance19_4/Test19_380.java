package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_380 {
    private final Production19_380 production = new Production19_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}