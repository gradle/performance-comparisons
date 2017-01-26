package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_132 {
    private final Production52_132 production = new Production52_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}