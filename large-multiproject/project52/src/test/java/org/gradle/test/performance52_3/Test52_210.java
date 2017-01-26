package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_210 {
    private final Production52_210 production = new Production52_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}