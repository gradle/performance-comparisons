package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_357 {
    private final Production52_357 production = new Production52_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}