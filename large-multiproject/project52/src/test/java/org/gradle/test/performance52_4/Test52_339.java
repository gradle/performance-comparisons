package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_339 {
    private final Production52_339 production = new Production52_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}