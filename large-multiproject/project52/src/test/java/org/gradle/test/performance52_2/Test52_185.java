package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_185 {
    private final Production52_185 production = new Production52_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}