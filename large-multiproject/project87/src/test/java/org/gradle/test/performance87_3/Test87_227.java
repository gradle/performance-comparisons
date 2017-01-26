package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_227 {
    private final Production87_227 production = new Production87_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}