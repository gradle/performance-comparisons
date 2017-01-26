package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_94 {
    private final Production52_94 production = new Production52_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}