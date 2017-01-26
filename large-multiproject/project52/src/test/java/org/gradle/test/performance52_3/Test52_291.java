package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_291 {
    private final Production52_291 production = new Production52_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}