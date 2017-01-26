package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_167 {
    private final Production62_167 production = new Production62_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}