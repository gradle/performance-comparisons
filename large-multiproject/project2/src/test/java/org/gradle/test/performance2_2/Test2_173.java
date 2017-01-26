package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_173 {
    private final Production2_173 production = new Production2_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}