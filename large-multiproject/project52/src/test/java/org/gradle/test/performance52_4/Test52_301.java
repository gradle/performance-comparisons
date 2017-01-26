package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_301 {
    private final Production52_301 production = new Production52_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}