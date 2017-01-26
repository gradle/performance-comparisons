package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_266 {
    private final Production52_266 production = new Production52_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}