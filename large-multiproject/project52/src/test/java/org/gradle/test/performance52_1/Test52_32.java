package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_32 {
    private final Production52_32 production = new Production52_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}