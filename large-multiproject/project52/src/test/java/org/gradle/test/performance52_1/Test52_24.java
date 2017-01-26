package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_24 {
    private final Production52_24 production = new Production52_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}