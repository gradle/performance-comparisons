package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_359 {
    private final Production19_359 production = new Production19_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}