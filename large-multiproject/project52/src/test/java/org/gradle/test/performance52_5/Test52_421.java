package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_421 {
    private final Production52_421 production = new Production52_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}