package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_447 {
    private final Production33_447 production = new Production33_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}