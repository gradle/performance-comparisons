package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_398 {
    private final Production52_398 production = new Production52_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}