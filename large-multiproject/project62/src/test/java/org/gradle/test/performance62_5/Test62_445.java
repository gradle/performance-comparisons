package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_445 {
    private final Production62_445 production = new Production62_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}