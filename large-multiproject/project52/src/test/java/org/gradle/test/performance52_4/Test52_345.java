package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_345 {
    private final Production52_345 production = new Production52_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}