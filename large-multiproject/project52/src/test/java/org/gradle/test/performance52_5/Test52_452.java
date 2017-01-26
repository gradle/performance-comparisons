package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_452 {
    private final Production52_452 production = new Production52_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}