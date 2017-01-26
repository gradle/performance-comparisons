package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_346 {
    private final Production64_346 production = new Production64_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}