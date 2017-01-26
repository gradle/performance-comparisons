package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_468 {
    private final Production52_468 production = new Production52_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}