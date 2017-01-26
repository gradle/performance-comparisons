package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_247 {
    private final Production52_247 production = new Production52_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}