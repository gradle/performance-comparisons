package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_379 {
    private final Production52_379 production = new Production52_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}