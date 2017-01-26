package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_136 {
    private final Production52_136 production = new Production52_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}