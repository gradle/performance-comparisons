package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_47 {
    private final Production59_47 production = new Production59_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}