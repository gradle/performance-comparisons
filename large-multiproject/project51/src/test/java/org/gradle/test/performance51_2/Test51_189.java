package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_189 {
    private final Production51_189 production = new Production51_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}