package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_227 {
    private final Production79_227 production = new Production79_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}