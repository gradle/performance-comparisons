package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_488 {
    private final Production52_488 production = new Production52_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}