package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_386 {
    private final Production29_386 production = new Production29_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}