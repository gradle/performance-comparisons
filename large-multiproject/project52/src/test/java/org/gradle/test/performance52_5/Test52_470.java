package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_470 {
    private final Production52_470 production = new Production52_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}