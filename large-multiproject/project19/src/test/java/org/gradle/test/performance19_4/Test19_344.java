package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_344 {
    private final Production19_344 production = new Production19_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}