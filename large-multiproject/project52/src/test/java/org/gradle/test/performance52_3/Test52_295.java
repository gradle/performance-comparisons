package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_295 {
    private final Production52_295 production = new Production52_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}