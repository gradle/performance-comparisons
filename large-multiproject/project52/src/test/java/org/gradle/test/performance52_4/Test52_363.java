package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_363 {
    private final Production52_363 production = new Production52_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}