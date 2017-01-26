package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_447 {
    private final Production91_447 production = new Production91_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}