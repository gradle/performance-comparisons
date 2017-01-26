package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_479 {
    private final Production52_479 production = new Production52_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}