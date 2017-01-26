package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_462 {
    private final Production52_462 production = new Production52_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}