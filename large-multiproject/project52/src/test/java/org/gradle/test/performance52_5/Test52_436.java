package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_436 {
    private final Production52_436 production = new Production52_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}