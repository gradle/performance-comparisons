package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_299 {
    private final Production52_299 production = new Production52_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}