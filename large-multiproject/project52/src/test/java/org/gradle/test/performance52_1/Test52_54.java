package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_54 {
    private final Production52_54 production = new Production52_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}