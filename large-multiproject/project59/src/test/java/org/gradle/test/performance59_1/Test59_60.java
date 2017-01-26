package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_60 {
    private final Production59_60 production = new Production59_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}