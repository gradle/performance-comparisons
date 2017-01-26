package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_223 {
    private final Production52_223 production = new Production52_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}