package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_386 {
    private final Production52_386 production = new Production52_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}