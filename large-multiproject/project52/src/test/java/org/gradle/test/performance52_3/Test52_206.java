package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_206 {
    private final Production52_206 production = new Production52_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}