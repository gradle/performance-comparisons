package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_124 {
    private final Production52_124 production = new Production52_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}