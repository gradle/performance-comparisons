package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_16 {
    private final Production52_16 production = new Production52_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}