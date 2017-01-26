package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_283 {
    private final Production52_283 production = new Production52_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}