package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_348 {
    private final Production52_348 production = new Production52_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}