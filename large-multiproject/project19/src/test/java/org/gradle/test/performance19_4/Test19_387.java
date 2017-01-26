package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_387 {
    private final Production19_387 production = new Production19_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}