package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_290 {
    private final Production52_290 production = new Production52_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}