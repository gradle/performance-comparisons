package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_472 {
    private final Production52_472 production = new Production52_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}