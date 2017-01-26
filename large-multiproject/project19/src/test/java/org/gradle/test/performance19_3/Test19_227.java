package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_227 {
    private final Production19_227 production = new Production19_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}