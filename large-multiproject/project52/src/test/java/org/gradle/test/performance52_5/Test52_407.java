package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_407 {
    private final Production52_407 production = new Production52_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}