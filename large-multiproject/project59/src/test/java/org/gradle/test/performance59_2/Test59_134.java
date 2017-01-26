package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_134 {
    private final Production59_134 production = new Production59_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}