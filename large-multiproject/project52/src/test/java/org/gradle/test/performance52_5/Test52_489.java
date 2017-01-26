package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_489 {
    private final Production52_489 production = new Production52_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}