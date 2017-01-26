package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_101 {
    private final Production52_101 production = new Production52_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}