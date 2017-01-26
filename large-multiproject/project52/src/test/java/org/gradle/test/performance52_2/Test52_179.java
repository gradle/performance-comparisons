package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_179 {
    private final Production52_179 production = new Production52_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}