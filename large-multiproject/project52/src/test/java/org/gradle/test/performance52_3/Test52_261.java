package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_261 {
    private final Production52_261 production = new Production52_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}