package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_250 {
    private final Production52_250 production = new Production52_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}