package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_164 {
    private final Production52_164 production = new Production52_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}