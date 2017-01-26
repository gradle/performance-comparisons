package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_258 {
    private final Production52_258 production = new Production52_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}