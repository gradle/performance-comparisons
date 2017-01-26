package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_469 {
    private final Production52_469 production = new Production52_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}