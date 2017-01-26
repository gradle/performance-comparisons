package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_423 {
    private final Production52_423 production = new Production52_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}