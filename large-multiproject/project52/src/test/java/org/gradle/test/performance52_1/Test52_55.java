package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_55 {
    private final Production52_55 production = new Production52_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}