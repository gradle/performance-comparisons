package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_175 {
    private final Production52_175 production = new Production52_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}