package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_492 {
    private final Production52_492 production = new Production52_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}