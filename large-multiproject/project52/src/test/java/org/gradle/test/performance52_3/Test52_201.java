package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_201 {
    private final Production52_201 production = new Production52_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}