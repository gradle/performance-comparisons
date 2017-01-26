package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_249 {
    private final Production52_249 production = new Production52_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}