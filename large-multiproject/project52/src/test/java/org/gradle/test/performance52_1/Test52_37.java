package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_37 {
    private final Production52_37 production = new Production52_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}