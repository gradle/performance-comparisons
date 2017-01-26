package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_169 {
    private final Production52_169 production = new Production52_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}