package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_145 {
    private final Production59_145 production = new Production59_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}