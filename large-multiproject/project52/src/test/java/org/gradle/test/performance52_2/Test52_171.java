package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_171 {
    private final Production52_171 production = new Production52_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}