package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_349 {
    private final Production52_349 production = new Production52_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}