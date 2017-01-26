package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_310 {
    private final Production52_310 production = new Production52_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}