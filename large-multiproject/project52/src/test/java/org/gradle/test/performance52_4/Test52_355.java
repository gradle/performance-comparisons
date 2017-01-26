package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_355 {
    private final Production52_355 production = new Production52_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}