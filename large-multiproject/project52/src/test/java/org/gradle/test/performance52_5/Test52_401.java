package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_401 {
    private final Production52_401 production = new Production52_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}