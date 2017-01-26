package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_105 {
    private final Production52_105 production = new Production52_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}