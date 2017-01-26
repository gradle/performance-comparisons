package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_73 {
    private final Production62_73 production = new Production62_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}