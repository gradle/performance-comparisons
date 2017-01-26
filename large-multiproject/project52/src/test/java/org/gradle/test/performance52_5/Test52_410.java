package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_410 {
    private final Production52_410 production = new Production52_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}