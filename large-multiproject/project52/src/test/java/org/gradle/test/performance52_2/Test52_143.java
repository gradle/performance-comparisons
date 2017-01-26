package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_143 {
    private final Production52_143 production = new Production52_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}