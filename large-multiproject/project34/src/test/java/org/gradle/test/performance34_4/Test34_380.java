package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_380 {
    private final Production34_380 production = new Production34_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}