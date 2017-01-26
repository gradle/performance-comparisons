package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_92 {
    private final Production59_92 production = new Production59_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}