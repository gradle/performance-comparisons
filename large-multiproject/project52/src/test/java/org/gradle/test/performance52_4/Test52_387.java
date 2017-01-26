package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_387 {
    private final Production52_387 production = new Production52_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}