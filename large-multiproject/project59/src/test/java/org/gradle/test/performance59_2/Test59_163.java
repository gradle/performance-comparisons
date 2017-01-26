package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_163 {
    private final Production59_163 production = new Production59_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}