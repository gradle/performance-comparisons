package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_477 {
    private final Production52_477 production = new Production52_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}