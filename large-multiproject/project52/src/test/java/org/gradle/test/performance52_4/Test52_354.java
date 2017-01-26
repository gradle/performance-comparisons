package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_354 {
    private final Production52_354 production = new Production52_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}