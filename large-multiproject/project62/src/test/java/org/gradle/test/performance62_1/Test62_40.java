package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_40 {
    private final Production62_40 production = new Production62_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}