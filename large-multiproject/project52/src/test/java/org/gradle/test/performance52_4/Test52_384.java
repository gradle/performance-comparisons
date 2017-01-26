package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_384 {
    private final Production52_384 production = new Production52_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}