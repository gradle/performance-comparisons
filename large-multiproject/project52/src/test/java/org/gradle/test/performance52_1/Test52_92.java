package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_92 {
    private final Production52_92 production = new Production52_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}