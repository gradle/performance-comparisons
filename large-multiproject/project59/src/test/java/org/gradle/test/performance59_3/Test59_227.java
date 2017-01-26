package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_227 {
    private final Production59_227 production = new Production59_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}