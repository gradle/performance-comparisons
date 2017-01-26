package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_87 {
    private final Production59_87 production = new Production59_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}