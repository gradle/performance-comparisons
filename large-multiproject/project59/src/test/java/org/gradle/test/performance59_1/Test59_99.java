package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_99 {
    private final Production59_99 production = new Production59_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}