package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_380 {
    private final Production51_380 production = new Production51_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}