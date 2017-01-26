package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_2 {
    private final Production59_2 production = new Production59_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}