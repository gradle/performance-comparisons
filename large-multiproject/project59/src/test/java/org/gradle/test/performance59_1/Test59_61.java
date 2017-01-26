package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_61 {
    private final Production59_61 production = new Production59_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}