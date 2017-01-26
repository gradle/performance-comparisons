package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_415 {
    private final Production91_415 production = new Production91_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}