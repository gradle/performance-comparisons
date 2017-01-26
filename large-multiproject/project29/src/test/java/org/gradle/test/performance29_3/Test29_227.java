package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_227 {
    private final Production29_227 production = new Production29_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}