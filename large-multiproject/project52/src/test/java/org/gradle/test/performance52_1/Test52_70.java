package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_70 {
    private final Production52_70 production = new Production52_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}