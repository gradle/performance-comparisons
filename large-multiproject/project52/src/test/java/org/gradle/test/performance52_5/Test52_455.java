package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_455 {
    private final Production52_455 production = new Production52_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}