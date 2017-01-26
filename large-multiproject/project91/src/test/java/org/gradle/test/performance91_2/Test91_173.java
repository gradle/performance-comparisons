package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_173 {
    private final Production91_173 production = new Production91_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}