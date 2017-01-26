package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_158 {
    private final Production52_158 production = new Production52_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}