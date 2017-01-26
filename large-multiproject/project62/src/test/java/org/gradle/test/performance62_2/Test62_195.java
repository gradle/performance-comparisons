package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_195 {
    private final Production62_195 production = new Production62_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}