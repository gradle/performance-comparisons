package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_121 {
    private final Production52_121 production = new Production52_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}