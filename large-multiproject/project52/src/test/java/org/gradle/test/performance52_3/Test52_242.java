package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_242 {
    private final Production52_242 production = new Production52_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}