package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_485 {
    private final Production52_485 production = new Production52_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}