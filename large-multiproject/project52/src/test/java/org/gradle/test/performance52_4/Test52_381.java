package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_381 {
    private final Production52_381 production = new Production52_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}