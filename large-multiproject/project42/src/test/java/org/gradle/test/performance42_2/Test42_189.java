package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_189 {
    private final Production42_189 production = new Production42_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}