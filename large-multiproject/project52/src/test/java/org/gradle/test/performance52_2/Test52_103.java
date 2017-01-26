package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_103 {
    private final Production52_103 production = new Production52_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}