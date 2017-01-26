package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_500 {
    private final Production62_500 production = new Production62_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}