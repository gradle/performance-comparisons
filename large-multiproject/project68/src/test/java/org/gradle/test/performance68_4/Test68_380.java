package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_380 {
    private final Production68_380 production = new Production68_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}