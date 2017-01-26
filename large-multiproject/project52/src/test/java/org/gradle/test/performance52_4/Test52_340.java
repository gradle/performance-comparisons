package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_340 {
    private final Production52_340 production = new Production52_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}