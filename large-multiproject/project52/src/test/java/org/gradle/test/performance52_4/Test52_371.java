package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_371 {
    private final Production52_371 production = new Production52_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}