package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_189 {
    private final Production33_189 production = new Production33_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}