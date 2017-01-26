package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_118 {
    private final Production52_118 production = new Production52_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}