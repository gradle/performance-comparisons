package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_221 {
    private final Production52_221 production = new Production52_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}