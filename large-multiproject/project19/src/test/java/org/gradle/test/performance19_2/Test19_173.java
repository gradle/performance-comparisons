package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_173 {
    private final Production19_173 production = new Production19_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}