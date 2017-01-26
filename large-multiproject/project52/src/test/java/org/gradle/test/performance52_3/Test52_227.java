package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_227 {
    private final Production52_227 production = new Production52_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}