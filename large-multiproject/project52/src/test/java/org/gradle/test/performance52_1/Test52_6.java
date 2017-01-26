package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_6 {
    private final Production52_6 production = new Production52_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}