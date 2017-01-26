package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_324 {
    private final Production52_324 production = new Production52_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}