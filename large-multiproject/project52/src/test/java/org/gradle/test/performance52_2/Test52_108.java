package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_108 {
    private final Production52_108 production = new Production52_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}