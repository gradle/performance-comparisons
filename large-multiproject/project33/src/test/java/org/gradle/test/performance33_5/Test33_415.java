package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_415 {
    private final Production33_415 production = new Production33_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}