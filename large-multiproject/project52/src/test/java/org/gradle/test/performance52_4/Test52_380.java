package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_380 {
    private final Production52_380 production = new Production52_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}