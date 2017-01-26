package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_343 {
    private final Production52_343 production = new Production52_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}