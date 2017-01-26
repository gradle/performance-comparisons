package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_370 {
    private final Production52_370 production = new Production52_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}