package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_415 {
    private final Production59_415 production = new Production59_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}