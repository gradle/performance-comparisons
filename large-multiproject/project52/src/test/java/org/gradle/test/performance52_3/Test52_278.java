package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_278 {
    private final Production52_278 production = new Production52_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}