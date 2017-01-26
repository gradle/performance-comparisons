package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_251 {
    private final Production52_251 production = new Production52_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}