package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_79 {
    private final Production52_79 production = new Production52_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}