package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_142 {
    private final Production52_142 production = new Production52_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}