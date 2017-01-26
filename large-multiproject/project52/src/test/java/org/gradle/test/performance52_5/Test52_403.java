package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_403 {
    private final Production52_403 production = new Production52_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}