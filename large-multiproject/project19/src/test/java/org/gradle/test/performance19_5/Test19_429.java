package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_429 {
    private final Production19_429 production = new Production19_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}