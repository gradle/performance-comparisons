package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_5 {
    private final Production52_5 production = new Production52_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}