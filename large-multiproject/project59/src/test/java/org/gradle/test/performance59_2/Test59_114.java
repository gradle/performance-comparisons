package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_114 {
    private final Production59_114 production = new Production59_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}