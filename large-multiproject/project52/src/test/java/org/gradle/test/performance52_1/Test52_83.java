package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_83 {
    private final Production52_83 production = new Production52_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}