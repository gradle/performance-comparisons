package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_146 {
    private final Production52_146 production = new Production52_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}