package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_463 {
    private final Production52_463 production = new Production52_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}