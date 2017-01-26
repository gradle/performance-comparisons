package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_137 {
    private final Production59_137 production = new Production59_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}