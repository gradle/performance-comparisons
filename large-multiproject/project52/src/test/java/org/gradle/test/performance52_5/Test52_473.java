package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_473 {
    private final Production52_473 production = new Production52_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}