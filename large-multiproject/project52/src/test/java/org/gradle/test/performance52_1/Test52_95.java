package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_95 {
    private final Production52_95 production = new Production52_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}