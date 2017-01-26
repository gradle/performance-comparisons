package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_473 {
    private final Production19_473 production = new Production19_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}