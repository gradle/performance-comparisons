package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_341 {
    private final Production52_341 production = new Production52_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}