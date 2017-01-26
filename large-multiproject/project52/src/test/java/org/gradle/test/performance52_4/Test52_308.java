package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_308 {
    private final Production52_308 production = new Production52_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}