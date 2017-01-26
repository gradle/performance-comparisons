package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_317 {
    private final Production52_317 production = new Production52_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}