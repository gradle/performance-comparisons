package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_438 {
    private final Production52_438 production = new Production52_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}