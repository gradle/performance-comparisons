package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_131 {
    private final Production52_131 production = new Production52_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}