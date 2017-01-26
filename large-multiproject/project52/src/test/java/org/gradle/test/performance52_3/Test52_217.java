package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_217 {
    private final Production52_217 production = new Production52_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}