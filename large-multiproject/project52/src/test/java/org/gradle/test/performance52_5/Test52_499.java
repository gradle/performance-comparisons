package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_499 {
    private final Production52_499 production = new Production52_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}