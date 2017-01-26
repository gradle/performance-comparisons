package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_18 {
    private final Production52_18 production = new Production52_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}