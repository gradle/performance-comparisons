package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_160 {
    private final Production52_160 production = new Production52_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}