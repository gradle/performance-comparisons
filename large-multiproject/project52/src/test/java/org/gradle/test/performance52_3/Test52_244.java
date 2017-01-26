package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_244 {
    private final Production52_244 production = new Production52_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}