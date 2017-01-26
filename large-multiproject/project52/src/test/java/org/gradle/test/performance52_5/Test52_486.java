package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_486 {
    private final Production52_486 production = new Production52_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}