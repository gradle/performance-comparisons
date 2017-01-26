package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_334 {
    private final Production52_334 production = new Production52_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}