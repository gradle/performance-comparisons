package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_165 {
    private final Production52_165 production = new Production52_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}