package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_412 {
    private final Production52_412 production = new Production52_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}