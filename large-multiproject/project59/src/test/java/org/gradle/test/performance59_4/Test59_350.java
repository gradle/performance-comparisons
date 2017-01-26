package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_350 {
    private final Production59_350 production = new Production59_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}