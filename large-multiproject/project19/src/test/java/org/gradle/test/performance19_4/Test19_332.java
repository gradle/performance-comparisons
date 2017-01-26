package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_332 {
    private final Production19_332 production = new Production19_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}