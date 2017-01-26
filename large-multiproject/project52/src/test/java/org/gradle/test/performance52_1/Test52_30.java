package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_30 {
    private final Production52_30 production = new Production52_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}