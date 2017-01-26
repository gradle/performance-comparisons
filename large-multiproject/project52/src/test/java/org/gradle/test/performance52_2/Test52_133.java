package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_133 {
    private final Production52_133 production = new Production52_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}