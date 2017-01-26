package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_446 {
    private final Production52_446 production = new Production52_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}