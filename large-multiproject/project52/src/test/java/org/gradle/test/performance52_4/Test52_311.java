package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_311 {
    private final Production52_311 production = new Production52_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}