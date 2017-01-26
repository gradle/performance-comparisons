package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_189 {
    private final Production64_189 production = new Production64_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}