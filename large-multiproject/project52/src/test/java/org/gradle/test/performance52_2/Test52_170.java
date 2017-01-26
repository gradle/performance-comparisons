package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_170 {
    private final Production52_170 production = new Production52_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}