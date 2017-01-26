package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_400 {
    private final Production52_400 production = new Production52_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}