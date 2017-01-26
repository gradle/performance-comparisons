package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_368 {
    private final Production19_368 production = new Production19_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}