package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_312 {
    private final Production52_312 production = new Production52_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}