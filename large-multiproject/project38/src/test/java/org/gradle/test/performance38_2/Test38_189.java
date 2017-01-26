package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_189 {
    private final Production38_189 production = new Production38_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}