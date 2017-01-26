package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_304 {
    private final Production52_304 production = new Production52_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}