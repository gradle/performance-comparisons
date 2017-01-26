package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_192 {
    private final Production52_192 production = new Production52_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}