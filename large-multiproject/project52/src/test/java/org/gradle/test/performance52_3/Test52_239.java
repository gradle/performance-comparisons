package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_239 {
    private final Production52_239 production = new Production52_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}