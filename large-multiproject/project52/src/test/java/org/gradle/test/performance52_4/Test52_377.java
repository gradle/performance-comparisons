package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_377 {
    private final Production52_377 production = new Production52_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}