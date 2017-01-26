package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_463 {
    private final Production64_463 production = new Production64_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}