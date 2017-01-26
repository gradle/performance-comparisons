package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_35 {
    private final Production59_35 production = new Production59_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}