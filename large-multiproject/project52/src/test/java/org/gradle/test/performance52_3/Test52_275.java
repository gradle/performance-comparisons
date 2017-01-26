package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_275 {
    private final Production52_275 production = new Production52_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}