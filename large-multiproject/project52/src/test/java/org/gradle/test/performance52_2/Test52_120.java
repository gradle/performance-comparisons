package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_120 {
    private final Production52_120 production = new Production52_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}