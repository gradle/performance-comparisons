package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_321 {
    private final Production52_321 production = new Production52_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}