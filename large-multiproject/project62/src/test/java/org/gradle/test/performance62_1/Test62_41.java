package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_41 {
    private final Production62_41 production = new Production62_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}