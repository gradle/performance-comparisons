package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_420 {
    private final Production19_420 production = new Production19_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}