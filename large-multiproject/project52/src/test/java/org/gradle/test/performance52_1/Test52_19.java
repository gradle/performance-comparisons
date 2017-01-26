package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_19 {
    private final Production52_19 production = new Production52_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}