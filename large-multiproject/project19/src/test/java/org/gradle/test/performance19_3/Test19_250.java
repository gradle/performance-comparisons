package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_250 {
    private final Production19_250 production = new Production19_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}