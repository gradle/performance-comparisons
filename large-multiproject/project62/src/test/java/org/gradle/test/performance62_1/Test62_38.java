package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_38 {
    private final Production62_38 production = new Production62_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}