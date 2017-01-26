package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_27 {
    private final Production62_27 production = new Production62_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}