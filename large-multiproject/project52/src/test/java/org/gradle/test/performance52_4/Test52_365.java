package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_365 {
    private final Production52_365 production = new Production52_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}