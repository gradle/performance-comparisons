package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_346 {
    private final Production19_346 production = new Production19_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}