package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_484 {
    private final Production52_484 production = new Production52_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}