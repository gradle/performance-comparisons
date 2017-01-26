package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_125 {
    private final Production52_125 production = new Production52_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}