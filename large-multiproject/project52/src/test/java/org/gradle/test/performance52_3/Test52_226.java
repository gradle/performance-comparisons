package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_226 {
    private final Production52_226 production = new Production52_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}