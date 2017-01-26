package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_342 {
    private final Production52_342 production = new Production52_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}