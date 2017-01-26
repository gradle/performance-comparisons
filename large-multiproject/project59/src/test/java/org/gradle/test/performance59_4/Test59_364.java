package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_364 {
    private final Production59_364 production = new Production59_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}