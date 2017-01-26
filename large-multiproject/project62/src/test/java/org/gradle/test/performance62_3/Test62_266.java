package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_266 {
    private final Production62_266 production = new Production62_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}