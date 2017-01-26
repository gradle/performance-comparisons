package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_271 {
    private final Production52_271 production = new Production52_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}