package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_316 {
    private final Production19_316 production = new Production19_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}