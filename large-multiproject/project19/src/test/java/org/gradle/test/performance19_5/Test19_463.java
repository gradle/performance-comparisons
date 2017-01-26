package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_463 {
    private final Production19_463 production = new Production19_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}