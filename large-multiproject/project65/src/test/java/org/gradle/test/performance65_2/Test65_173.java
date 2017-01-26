package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_173 {
    private final Production65_173 production = new Production65_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}