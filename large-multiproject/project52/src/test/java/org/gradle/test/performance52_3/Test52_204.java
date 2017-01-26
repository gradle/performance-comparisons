package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_204 {
    private final Production52_204 production = new Production52_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}