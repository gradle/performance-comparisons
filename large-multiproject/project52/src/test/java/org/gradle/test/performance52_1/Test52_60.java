package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_60 {
    private final Production52_60 production = new Production52_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}