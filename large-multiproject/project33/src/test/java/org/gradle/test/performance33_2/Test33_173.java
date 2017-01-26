package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_173 {
    private final Production33_173 production = new Production33_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}