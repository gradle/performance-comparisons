package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_287 {
    private final Production52_287 production = new Production52_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}