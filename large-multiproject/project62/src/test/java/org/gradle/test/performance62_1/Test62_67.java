package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_67 {
    private final Production62_67 production = new Production62_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}