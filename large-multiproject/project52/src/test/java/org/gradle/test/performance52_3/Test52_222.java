package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_222 {
    private final Production52_222 production = new Production52_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}