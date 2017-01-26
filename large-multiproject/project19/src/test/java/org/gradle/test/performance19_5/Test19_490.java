package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_490 {
    private final Production19_490 production = new Production19_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}