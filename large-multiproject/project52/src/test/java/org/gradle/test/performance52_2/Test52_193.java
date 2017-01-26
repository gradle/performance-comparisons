package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_193 {
    private final Production52_193 production = new Production52_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}