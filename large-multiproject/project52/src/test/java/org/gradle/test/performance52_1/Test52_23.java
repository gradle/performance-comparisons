package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_23 {
    private final Production52_23 production = new Production52_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}