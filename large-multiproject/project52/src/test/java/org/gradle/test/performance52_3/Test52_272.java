package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_272 {
    private final Production52_272 production = new Production52_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}