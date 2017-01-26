package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_447 {
    private final Production59_447 production = new Production59_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}