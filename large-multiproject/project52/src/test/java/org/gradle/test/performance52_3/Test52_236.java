package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_236 {
    private final Production52_236 production = new Production52_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}